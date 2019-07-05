class SpaceAge {

    double ageInSeconds;
    double earthSeconds = 31557600;

    SpaceAge(double seconds) {
        ageInSeconds = seconds;
    }

    double getSeconds(double earthYear) {
        return earthYear*earthSeconds;
    }

    double onEarth() {
        return ageInSeconds/earthSeconds;
    }

    double onMercury() {

        double seconds = getSeconds(0.2408467);
        return ageInSeconds/seconds;
    }

    double onVenus() {
        double seconds = getSeconds(0.61519726);
        return ageInSeconds/seconds;
    }

    double onMars() {
        double seconds = getSeconds(1.8808158);
        return ageInSeconds/seconds;
    }

    double onJupiter() {
        double seconds = getSeconds(11.862615);
        return ageInSeconds/seconds;
    }

    double onSaturn() {
        double seconds = getSeconds(29.447498);
        return ageInSeconds/seconds;
    }

    double onUranus() {
        double seconds = getSeconds(84.016846);
        return ageInSeconds/seconds;
    }

    double onNeptune() {
        double seconds = getSeconds(164.79132);
        return ageInSeconds/seconds;
    }

}
