package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run fast");
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("jump high");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("cannot turn~");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("Iam advanced level boi!");
	}

}
