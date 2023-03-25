package view;

import controller.SimulacaoController;

public class Main {

	public static void main(String[] args) {
		SimulacaoController s = new SimulacaoController();
		
		try {
			s.simulationOne();
			s.simulationTwo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
