class Rectangle{
	private double largeur;
	private double longueur;
	
	public Rectangle(double largeur,double longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	public double surface() {
		return largeur * longueur;
	}
}

class ManipRectangle {

	public static void main(String[] args) {
		System.out.println("surface : " + new Rectangle(4, 7).surface());
	}

}
