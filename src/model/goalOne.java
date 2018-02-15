package model;


public class goalOne extends winGoal {

	@Override
	public boolean checkWin(Player one) {
		// TODO Auto-generated method stub
		return !one.isDead() && one.getLevel()>=10;
	}

	@Override
	public String getWinCondition() {
		// TODO Auto-generated method stub
		return "First Goal";
	}

}
