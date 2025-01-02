package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePassengerByAirlineIDTestData {

    private String name;
    private String trips;
    private String airline;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrips() {
        return trips;
    }

    public void setTrips(String trips) {
        this.trips = trips;
    }



    @Override
    public String toString() {
        return "CreatePassengerByAirlineIDTestData{" +
                "name='" + name + '\'' +
                ", trips='" + trips + '\'' +
                ", airline='" + airline + '\'' +
                '}';
    }
}
