package katarem.lolapi;

import katarem.lolapi.api.mastery.*;
import katarem.lolapi.constants.Langs;
import katarem.lolapi.constants.Platform;
import katarem.lolapi.constants.Region;
import katarem.lolapi.services.*;
import katarem.lolapi.api.Summoner;
import katarem.lolapi.api.game.GameInfo;
import katarem.lolapi.api.game.Participant;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
       
        LoLService service = new LoLService.Builder()
                                .setLang(Langs.POLISH)
                                .setVersion("13.3.1")
                                .build();

    }
}

    
