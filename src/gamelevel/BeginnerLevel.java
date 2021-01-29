package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run slowly");

	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("cannot jump~");

	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("cannot turn");

	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("very beginning level");

	}

}
