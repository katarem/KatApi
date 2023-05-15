package io.github.katarem.katapi.constants;

public enum Langs {
    CZECH("cs_CZ"),
    GREEK("el_GR"),
    POLISH("pl_PL"),
    ROMANIAN("ro_RO"),
    HUNGARIAN("hu_HU"),
    SPANISH_MEXICO("es_MX"),
    SPANISH_ARGENTINA("es_AR"),
    SPANISH_SPAIN("es_ES"),
    ENGLISH_UK("en_GB"),
    ENGLISH_US("en_US"),
    ENGLISH_AUSTRALIA("en_AU"),
    GERMAN("de_DE"),
    ITALIAN("it_IT"),
    JAPANESE("jp_JP"),
    PORTUGUESE_BRAZIL("pt_BR"),
    RUSSIAN("ru_RU"),
    TURKISH("tr_TR"),
    ENGLISH_PHILIPPINES("en_PH"),
    ENGLISH_SINGAPORE("en_SG"),
    THAI("th_TH"),
    VIETNAMESE("vn_VN"),
    INDONESIAN("id_ID"),
    CHINESE_MALAYSIA("zh_MY"),
    CHINESE_CHINA("zh_CN"),
    CHINESE_TAIWAN("zh_TW");

    public String lang;

    Langs(String lang) {
        this.lang = lang;
    }

}
