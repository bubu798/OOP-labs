package lab10.builder;

public class House {

	// TODO: write optional and mandatory facilities to have in a house
	private String location;
	private int nrOfRooms;
	private int nrOfFloors;
	private int wifi;
	private int solarPanels;
	private int pool;

	// TODO: complete the private constructor
	private House(HouseBuilder builder) {
		this.location = builder.location;
		this.nrOfRooms = builder.nrOfRooms;
		this.nrOfFloors = builder.nrOfFloors;
		this.wifi = builder.wifi;
		this.solarPanels = builder.solarPanels;
		this.pool = builder.pool;
	}

	// TODO: generate getters

	public String getLocation() {
		return location;
	}

	public int getNrOfRooms() {
		return nrOfRooms;
	}

	public int getNrOfFloors() {
		return nrOfFloors;
	}

	public int getWifi() {
		return wifi;
	}

	public int getSolarPanels() {
		return solarPanels;
	}

	public int getPool() {
		return pool;
	}


	// TODO: override toString method


	@Override
	public String toString() {
		return "House{" +
				"location='" + location + '\'' +
				", nrOfRooms=" + nrOfRooms +
				", nrOfFloors=" + nrOfFloors +
				", wifi=" + wifi +
				", solarPanels=" + solarPanels +
				", pool=" + pool +
				'}';
	}

	public static class HouseBuilder {

		// TODO: write same facilities

		private String location;
		private int nrOfRooms;
		private int nrOfFloors;
		private int wifi = 0;
		private int solarPanels = 0;
		private int pool = 0;

		// TODO: complete the house builder constructor only with the mandatory facilities
		public HouseBuilder(String location, int nrOfRooms, int nrOfFloors) {
			this.location = location;
			this.nrOfRooms = nrOfRooms;
			this.nrOfFloors = nrOfFloors;

		}

		// TODO: add the optional facilities in a builder design
		public HouseBuilder wifi(int wifi) {
			this.wifi = wifi;
			return this;
		}

		public HouseBuilder solarPanels(int solarPanels) {
			this.solarPanels = solarPanels;
			return this;
		}

		public HouseBuilder pool(int pool) {
			this.pool = pool;
			return this;
		}

		// TODO: complete the final build method
		public House build() {
			return new House(this);
		}

		// TODO: test functionality in a Main class
	}
}
