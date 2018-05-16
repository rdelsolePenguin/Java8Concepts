package animal.domain;

public class Penguin implements Bird {
    @Override
    public Double maxMovementInKm() {
        return 12.5;
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
        return obj != null && obj instanceof Bird && this.getSpecie().equals((((Bird) obj).getSpecie()));
    }
}
