public class DVD extends Item{

	String director;
    String movieStar;

	public DVD()
	{
		super();
	}

    public DVD(String theTitle, String theDirector, String star, int time, float price)
	{
       	super(theTitle,time,price);
		this.director = theDirector;
		this.movieStar = star;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector (String director){
        this.director=director;
    }

	public String getStar(){
        return movieStar;
    }


    public void setStar( String movieStar){
        this.movieStar=movieStar;
    }

    @Override
    public void print(){
    	System.out.println("DVD details :");
        System.out.println("Title : " + super.getTitle() + "\nDirector : " + this.director + "\nMovie Star : " + this.movieStar + "\nTime : " + super.getplayingTime() + "\nPrice : " + super.getPrice());
    }
}
