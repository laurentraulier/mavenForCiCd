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
