import java.util.Random;

public class Anemometro implements Sensor{

	@Override
	public Double sensar() {
		return new Random().nextDouble(60.0);
	}

}
