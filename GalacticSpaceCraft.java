public class GalacticSpaceCraft {
    private int x;
    private int y;
    private int z;
    private String direction;

    public GalacticSpaceCraft(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void moveForward() {
        if ("N".equals(direction)) {
            y++;
        } else if ("S".equals(direction)) {
            y--;
        } else if ("E".equals(direction)) {
            x++;
        } else if ("W".equals(direction)) {
            x--;
        } else if ("Up".equals(direction)) {
            z++;
        } else if ("Down".equals(direction)) {
            z--;
        }
    }

    public void moveBackward() {
        if ("N".equals(direction)) {
            y--;
        } else if ("S".equals(direction)) {
            y++;
        } else if ("E".equals(direction)) {
            x--;
        } else if ("W".equals(direction)) {
            x++;
        } else if ("Up".equals(direction)) {
            z--;
        } else if ("Down".equals(direction)) {
            z++;
        }
    }

    public void turnLeft() {
        if ("N".equals(direction)) {
            direction = "W";
        } else if ("S".equals(direction)) {
            direction = "E";
        } else if ("E".equals(direction)) {
            direction = "N";
        } else if ("W".equals(direction)) {
            direction = "S";
        }
    }

    public void turnRight() {
        if ("N".equals(direction)) {
            direction = "E";
        } else if ("S".equals(direction)) {
            direction = "W";
        } else if ("E".equals(direction)) {
            direction = "S";
        } else if ("W".equals(direction)) {
            direction = "N";
        }
    }

    public void turnUp() {
        if ("N".equals(direction) || "S".equals(direction)) {
            direction = "Up";
        }
    }

    public void turnDown() {
        if ("N".equals(direction) || "S".equals(direction)) {
            direction = "Down";
        }
    }

    public void executeCommands(String[] commands) {
        for (String command : commands) {
            if ("f".equals(command)) {
                moveForward();
            } else if ("b".equals(command)) {
                moveBackward();
            } else if ("l".equals(command)) {
                turnLeft();
            } else if ("r".equals(command)) {
                turnRight();
            } else if ("u".equals(command)) {
                turnUp();
            } else if ("d".equals(command)) {
                turnDown();
            }
        }
    }

    public int[] getPosition() {
        return new int[]{x, y, z};
    }

    public String getDirection() {
        return direction;
    }

    public static void main(String[] args) {
        int[] startingPosition = {0, 0, 0};
        String initialDirection = "N";
        String[] commands = {"f", "r", "u", "b", "l"};

        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(startingPosition[0], startingPosition[1], startingPosition[2], initialDirection);
        spacecraft.executeCommands(commands);

        int[] finalPosition = spacecraft.getPosition();
        String finalDirection = spacecraft.getDirection();

        System.out.println("Final Position: (" + finalPosition[0] + ", " + finalPosition[1] + ", " + finalPosition[2] + ")");
        System.out.println("Final Direction: " + finalDirection);
    }
}

