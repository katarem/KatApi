package io.github.katarem.katapi;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.katarem.katapi.api.Summoner;
import io.github.katarem.katapi.api.mastery.Champion;
import io.github.katarem.katapi.api.mastery.Mastery;
import io.github.katarem.katapi.constants.Langs;
import io.github.katarem.katapi.constants.Platform;
import io.github.katarem.katapi.constants.Region;
import io.github.katarem.katapi.services.LoLService;

public class Tests {

    private LoLService service;
    private String playerName;

    @Before
    public void setUp(){
        Properties properties = new Properties();
        try {
            
            InputStreamReader reader = new InputStreamReader(Tests.class.getResourceAsStream("/config.properties"), Charset.forName("UTF8"));
            properties.load(reader);
            String apiKey = properties.getProperty("API_KEY");
            String[] playerName = properties.getProperty("ACCOUNT").split("#");
            String version = properties.getProperty("VERSION","14.22.1");
            
            this.playerName = playerName[0];
            LoLService.setApiKey(apiKey);
            service = new LoLService.Builder()
                .setLang(Langs.ENGLISH_UK)
                .setPlatform(Platform.EUROPE_WEST)
                .setRegion(Region.EUROPE)
                .setVersion(version)
                .forSummoner(playerName[0], playerName[1])
                .build();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void service_should_work_with_given_name(){
        Summoner expectedSummoner = new Summoner();
        expectedSummoner.setName(playerName);
        
        Summoner actualSummoner = service.getSummoner();
        Assert.assertNotNull(actualSummoner);
        Assert.assertEquals(expectedSummoner.getName(), actualSummoner.getName());
    }

    @Test
    public void service_should_fetch_masteries() throws Exception {
        List<Mastery> masteries = service.getMasteries(Platform.EUROPE_WEST);
        Assert.assertNotNull(masteries);
        Assert.assertFalse(masteries.isEmpty());
        masteries.forEach(mastery -> {
            Assert.assertNotNull(mastery);
            Assert.assertNotNull(mastery.getChampionId());
            Assert.assertNotNull(mastery.getChampionLevel());
            Assert.assertNotNull(mastery.getChampionPoints());
            Assert.assertNotNull(mastery.getChampionPointsSinceLastLevel());
            Assert.assertNotNull(mastery.getChampionPointsUntilNextLevel());
            Assert.assertNotNull(mastery.getChestGranted());
            Assert.assertNotNull(mastery.getLastPlayTime());
            Assert.assertNotNull(mastery.getSummonerId());
            Assert.assertNotNull(mastery.getTokensEarned());
        });
    }

    @Test
    public void service_should_fetch_champions() throws Exception{
        Collection<Champion> champions = service.getChampions(Langs.ENGLISH_UK);
        Assert.assertNotNull(champions);
        Assert.assertFalse(champions.isEmpty());
        champions.forEach(champion -> {
            Assert.assertNotNull(champion);
            
            Assert.assertNotNull(champion.getBlurb());
            Assert.assertFalse(champion.getBlurb().isBlank());
            Assert.assertFalse(champion.getBlurb().isEmpty());

            Assert.assertNotNull(champion.getId());
            Assert.assertFalse(champion.getId().isBlank());
            Assert.assertFalse(champion.getId().isEmpty());

            Assert.assertNotNull(champion.getKey());
            Assert.assertFalse(champion.getKey().isBlank());
            Assert.assertFalse(champion.getKey().isEmpty());

            Assert.assertNotNull(champion.getName());
            Assert.assertFalse(champion.getName().isBlank());
            Assert.assertFalse(champion.getName().isEmpty());

            Assert.assertNotNull(champion.getPartype());
            Assert.assertFalse(champion.getPartype().isBlank());
            Assert.assertFalse(champion.getPartype().isEmpty());

            Assert.assertNotNull(champion.getTitle());
            Assert.assertFalse(champion.getTitle().isBlank());
            Assert.assertFalse(champion.getTitle().isEmpty());

            Assert.assertNotNull(champion.getTags());
            Assert.assertFalse(champion.getTags().isEmpty());
            champion.getTags().forEach(tag -> {
                Assert.assertNotNull(tag);
                Assert.assertFalse(tag.isBlank());
                Assert.assertFalse(tag.isEmpty());
            });

            Assert.assertNotNull(champion.getVersion());
            Assert.assertFalse(champion.getVersion().isBlank());
            Assert.assertFalse(champion.getVersion().isEmpty());

            Assert.assertNotNull(champion.getImage());

            Assert.assertNotNull(champion.getStats());
            Assert.assertNotNull(champion.getStats().getArmor());
            Assert.assertNotNull(champion.getStats().getArmorperlevel());
            Assert.assertNotNull(champion.getStats().getAttackdamage());
            Assert.assertNotNull(champion.getStats().getAttackdamageperlevel());
            Assert.assertNotNull(champion.getStats().getAttackrange());
            Assert.assertNotNull(champion.getStats().getAttackspeed());
            Assert.assertNotNull(champion.getStats().getAttackspeedperlevel());
            Assert.assertNotNull(champion.getStats().getCrit());
            Assert.assertNotNull(champion.getStats().getCritperlevel());
            Assert.assertNotNull(champion.getStats().getHp());
            Assert.assertNotNull(champion.getStats().getHpperlevel());
            Assert.assertNotNull(champion.getStats().getHpregen());
            Assert.assertNotNull(champion.getStats().getHpregenperlevel());
            Assert.assertNotNull(champion.getStats().getMovespeed());
            Assert.assertNotNull(champion.getStats().getMp());
            Assert.assertNotNull(champion.getStats().getMpperlevel());
            Assert.assertNotNull(champion.getStats().getMpregen());
            Assert.assertNotNull(champion.getStats().getSpellblock());
            Assert.assertNotNull(champion.getStats().getSpellblockperlevel());
            Assert.assertNotNull(champion.getStats().getMpregenperlevel());
        });
    }

}
