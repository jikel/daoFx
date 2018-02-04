package minos.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Label {

	private final StringProperty firstName;
	private final StringProperty lastName;
	private final StringProperty bTranslate;
	private final StringProperty displayWindow;

	/**
	 * Default constructor.
	 */
	public Label() {
		this(null, null);
	}

	/**
	 * Constructor with some initial data.
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Label(String firstName, String lastName) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);

		this.bTranslate = new SimpleStringProperty("traduit");
		this.displayWindow = new SimpleStringProperty("affiche");
	}

	public String getFirstName() {
		return firstName.get();
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}

	public StringProperty firstNameProperty() {
		return firstName;
	}

	public String getLastName() {
		return lastName.get();
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}

	public StringProperty lastNameProperty() {
		return lastName;
	}

	// debut copiercoller
	public String getBTranslate() {
		return bTranslate.get();
	}

	public void setBTranslate(String bTranslate) {
		this.bTranslate.set(bTranslate);
	}

	public StringProperty bTranslateProperty() {
		return bTranslate;
	}
	public String getDisplayWindow() {
		return displayWindow.get();
	}

	public void setDisplayWindow(String displayWindow) {
		this.displayWindow.set(displayWindow);
	}

	public StringProperty displayWindowProperty() {
		return displayWindow;
	}
}
