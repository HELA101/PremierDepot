package git;
public class calculatrice {
		public double addition(double a, double b) {
		   return a + b;
		}

		public double soustraction(double a, double b) {
		   return a - b;
		}

		public double multiplication(double a, double b) {
		   return a * b;
		}

		public double division(double a, double b) {
		   if (b == 0) {
		       throw new ArithmeticException("Erreur : Division par z�ro.");
		   }
		   return a / b;
		}
		}

