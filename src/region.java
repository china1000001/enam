public enum region {
    JALALABAD("😎😎😎"),
    OSH("😶‍🌫️😶‍🌫️😶‍🌫️"),
    NARYN("╰(*°▽°*)╯"),
    ISSYKKUL("☆*: .｡. o(≧▽≦)o .｡.:*☆"),
    CHUY("😒😒😒"),
    BATKEN("😂😂😂"),
    BISHKEK("biskekchanen👽👽👽");

    private String mean;


    region(String mean) {
        this.mean=mean;
    }

    @Override
    public String toString() {
        return "region{" +
                "mean='" + mean + '\'' +
                '}';
    }
}
