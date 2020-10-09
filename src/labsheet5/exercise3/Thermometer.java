package labsheet5.exercise3;


public class Thermometer {

        private int currentTemperature;
        private int maximumTemperature;
        private int minimumTemperature;

    public Thermometer(){
        setCurrentTemperature(0);
        setMaximumTemperature(Integer.MAX_VALUE);
        setMinimumTemperature(Integer.MIN_VALUE);
    }

    public Thermometer(int currentTemperature) {
        setCurrentTemperature(currentTemperature);
        setMaximumTemperature(currentTemperature);
        setMinimumTemperature(currentTemperature);

    }
        public int getCurrentTemperature(){
            return currentTemperature;

        }

        public void setTemperature(int currentTemperature){
        setCurrentTemperature(currentTemperature);
        updateMaxMinTemp();
        }

        public void setCurrentTemperature(int currentTemperature) {
            this.currentTemperature = currentTemperature;
        }

        public int getMaximumTemperature(){
            return maximumTemperature;
        }

        public void setMaximumTemperature(int maximumTemperature) {
            this.maximumTemperature = maximumTemperature;
        }

        public int getMinimumTemperature(){
            return minimumTemperature;
        }

        public void setMinimumTemperature(int minimumTemperature){
            this.minimumTemperature = minimumTemperature;

        }

        private void updateMaxMinTemp(){
            if(currentTemperature > maximumTemperature)
                maximumTemperature = currentTemperature;

            if(currentTemperature < minimumTemperature);
                minimumTemperature = currentTemperature;

        }

        public String toString(){
        return "Current temperature" + getCurrentTemperature() + "\n" + "Maximum temperature" + getMaximumTemperature() +
               "\n" + "Minimum temperature" + getMinimumTemperature() + "\n";
        }

}
