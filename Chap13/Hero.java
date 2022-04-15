package practice;
public class Hero {
    String name;
    int hp;
    static int money;
    public Hero(String name) {
    	this.name = name;
    	this.hp = 50;
    }
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
    
}