class Circunferencia{
    private float raio;
    private float area;
    private float perimetro;

    public Circunferencia(float raio){
        this.raio = raio;
        calcularArea();
        calcularPerimetro();
    }
    private void calcularArea(){
        area = (float)(Math.PI*Math.pow(raio, 2));
    }
    private void calcularPerimetro(){
        perimetro = (float) (2*Math.PI*raio);
    }
    public void setRaio(float raio) {
        this.raio = raio;
        calcularArea();
        calcularPerimetro();
    } 
    public float getArea() {
        return area;
    }
    public float getPerimetro() {
        return perimetro;
    }
}