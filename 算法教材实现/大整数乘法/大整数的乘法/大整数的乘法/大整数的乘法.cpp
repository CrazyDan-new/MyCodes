#include <iostream>
#include <cmath>
using namespace std;

unsigned int multiply(unsigned int x, unsigned y, int length) {
	if (length < 2 ) {
		return x * y;
	}
	unsigned int A = x / pow(10, length / 2);
	unsigned int B = x - A*pow(10,length/2);
	unsigned int C = y / pow(10, length / 2);
	unsigned int D = x - C * pow(10, length / 2);
	unsigned int AC = multiply(A, C, length / 2);
	unsigned int BD = multiply(B, D, length / 2);
	unsigned int ABCD = multiply(A - B, D - C, length / 2);
	return AC * pow(10, length) + (ABCD + AC + BD) * pow(10, length / 2) + BD;
}


int main()
{
	unsigned int X, Y, n;
	cout << "X: ";
	cin >> X;
	cout << endl << "Y: ";
	cin >> Y;
	cout <<endl<< "n: ";
	cin >> n;
	cout << multiply(X, Y, n);
}

