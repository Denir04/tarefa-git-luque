class Retangulo{
    private float base;
    private float altura;
    private float area;
    private float perimetro;

    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }
    private void calcularArea(){
        area = base * altura;
    }
    private void calcularPerimetro(){
        perimetro = 2 * (base + altura);
    }
    public void setBase(float base) {
        this.base = base;
        calcularArea();
        calcularPerimetro();
    } 
    public void setAltura(float altura) {
        this.altura = altura;
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