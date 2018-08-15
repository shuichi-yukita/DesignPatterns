package lec04abstractFactory.factory;

public abstract class Link extends Item {
	protected String url;
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
	@Override
	public abstract String makeHTML();

}
