public class Reporter {
    private int[] gates;
    private int[] servedByGateNum;
    private int gatesNum;
    private int totalServed = 0;
    private int fullValue = 0;

    public Reporter(int gatesNum) {
        this.gatesNum = gatesNum;
        this.gates = new int[gatesNum + 1];
        for (int i = 1; i <= gatesNum; i++)
            this.gates[i] = i;
        this.servedByGateNum = new int[gatesNum + 1];
        for (int i = 0; i <= gatesNum; i++)
            this.servedByGateNum[i] = 0;
    }

    public int findIndex(Car car) {
        int index = car.gate.gateNumber;
        return index;
    }

    public void reportCar(Car car) {
        int index = findIndex(car);
        if (index != -1) {
            servedByGateNum[index]++;
            totalServed++;
        }
        return;
    }

    public void updateFullValue(int value) {
        this.fullValue = value;
        return;
    }

    public void printReport() {
        System.out.println(
                "...\nTotal Cars Served: " + totalServed + "\nCurrent Cars in Parking: " + (fullValue) + "\nDetails:");
        for (int i = 1; i <= gatesNum; i++) {
            System.out.println("-Gate " + gates[i] + " served " + servedByGateNum[i] + " cars.");
        }
        return;
    }

}
