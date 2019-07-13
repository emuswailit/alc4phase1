package ke.co.mobiticket;

public final class Learner {
    private final String track;
    private final String country;
    private final String email;
    private final String phone_number;
    private final String slack_username;

    public Learner(String track, String country, String email, String phone_number, String slack_username) {
        this.track = track;
        this.country = country;
        this.email = email;
        this.phone_number = phone_number;
        this.slack_username = slack_username;
    }


    public String getTrack() {
        return track;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getSlack_username() {
        return slack_username;
    }

    @Override
    public String toString() {
        return getEmail()+" "+getSlack_username();
    }
}
