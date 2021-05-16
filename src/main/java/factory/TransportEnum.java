package factory;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TransportEnum {
    AIRPOST(new AirPostFactory(), "By air post"),
    TRAINPOST(new TrainPostFactory(), "By train post"),
    AUTOPOST(new AutoPostFactory(), "By auto post"),
    SEAPOST(new SeaPostFactory(), "By sea post"),
    COURIER(new CourierPostFactory(), "By transport.CourierPost");

    @Getter(AccessLevel.PACKAGE)
    private final PostFactory factory;

    @Getter
    private final String name;

}
