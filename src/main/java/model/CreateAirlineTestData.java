package model;

public class CreateAirlineTestData {

    private String id;
    private String name;
    private String logo;
    private String country;
    private String slogan;
    private String head_quaters;
    private String website;
    private String established;

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHead_quaters() {
        return head_quaters;
    }

    public void setHead_quaters(String head_quaters) {
        this.head_quaters = head_quaters;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEstablished() {
        return established;
    }

    public void setEstablished(String established) {
        this.established = established;
    }

    @Override
    public String toString() {
        return "CreateAirlineTestData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", country='" + country + '\'' +
                ", slogan='" + slogan + '\'' +
                ", head_quaters='" + head_quaters + '\'' +
                ", website='" + website + '\'' +
                ", established='" + established + '\'' +
                '}';
    }
}
