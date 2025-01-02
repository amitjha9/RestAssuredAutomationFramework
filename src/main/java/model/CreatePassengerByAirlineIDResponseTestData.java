package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePassengerByAirlineIDResponseTestData {

    private String name;
    private String trips;
    private List<CreateAirlineTestData> airline;

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

    public List<CreateAirlineTestData> getAirline() {
        return airline;
    }

    public void setAirline(List<CreateAirlineTestData> airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "CreatePassengerByAirlineIDResponseTestData{" +
                "name='" + name + '\'' +
                ", trips='" + trips + '\'' +
                ", airline=" + airline +
                '}';
    }
}
