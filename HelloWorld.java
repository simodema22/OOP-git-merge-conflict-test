int procNumber() {
	return Runtime.getRuntime().availableProcessors();
}

void main() {
	IO.println("This program is running in a PC with " + procNumber() + " logic processors!");

final String AUTHOR = "Danilo Pianini";

void main() {
	IO.println("This program has been realised by " + AUTHOR);
}
