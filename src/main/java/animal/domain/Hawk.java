package animal.domain;

public class Hawk implements Bird {
    @Override
    public Double maxMovementInKm() {
        return 45.5;
    }

    @Override
    public String bodyCoverage() {
        return "feathers";
    }

    @Override
    public String getSpecie() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Bird))
            return false;

        return this.getSpecie().equals((((Bird) obj).getSpecie()));
    }
}
