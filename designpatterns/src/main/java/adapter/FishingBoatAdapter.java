package adapter;

/**
 * Adapter class. Adapts the interface of the device ({@link FishingBoat}) into {@link RowingBoat}
 * interface expected by the client ({@link Captain}).
 *
 */
public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        fishingBoat = new FishingBoat();
    }

    public void row() {
        fishingBoat.sail();
    }
}
