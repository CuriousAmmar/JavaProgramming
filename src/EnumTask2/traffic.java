package EnumTask2;

class traffic {

    trafficlightcolors color;

    traffic() {
        color = trafficlightcolors.RED;
    }

    void changeColor() {
        switch (color) {
            case RED:
                color = trafficlightcolors.GREEN;
                break;
            case GREEN:
                color = trafficlightcolors.YELLOW;
                break;
            case YELLOW:
                color = trafficlightcolors.RED;
                break;
        }
    }

    public String toString() {
        return "Light is: " + color;
    }
}
