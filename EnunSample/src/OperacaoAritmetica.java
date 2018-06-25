
public enum OperacaoAritmetica {

	ADICAO {
		public int operacao(int x, int y) {
			return x + y;
		}
	},
	SUBTRACAO {
		public int operacao(int x, int y) {
			return x - y;
		}
	},	
	MULTIPLICACAO{

		public int operacao(int x, int y) {
			return x * y;			
		}
		
	},
	DIVISAO{

		public int operacao(int x, int y) {
			if (y == 0)
				throw new IllegalArgumentException("Argument 'divisor' is 0");
			return x / y;
		}
		
	};
	
	public abstract int operacao(int x, int y);
}
