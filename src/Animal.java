public class Animal {

    // еда
    private boolean eats = true;
    public boolean getEats() {
	return eats;
    }

    // хвост
    private boolean tail = true;
    public boolean getTail() {
        return tail;
    }

    public void setTail(boolean var) {
        tail = var;
    }

    // лапы
    private int legs = 4;
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if (legs > 0) {
            this.legs = legs;
        }
    }

    // шерсть
    boolean fur = true;

    // спит
    public void sleep() {
        System.out.println("Животное спит");
    }

    // ест
    public void eats() {
	this.eats = eats;
    }
}
