package hello;

public class Population_evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  current_population = 312032486.00;
		for(int i=1;i<=5;i++){
				
			double  born = 60*60*24*365*i/7.0;
			double  death = 60*60*24*365*i/13.0;
			double  immigration = 60*60*24*365*i/45.0;
			double future_population = current_population + born - death + immigration;
			System.out.println("year" + i + ":" + future_population );
		}
	}

}
