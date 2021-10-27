#include <iostream>
using namespace std;

unsigned long step = 0;

void move(char src, char des) {
    step++;
    cout << src << "->" << des << endl;
}

void hanoi(int n, char a, char b, char c) {
    if (n > 0) {
        hanoi(n - 1, a, c, b);
        move(a, b);
        hanoi(n - 1, c, b, a);
    }
}
int main()
{
    hanoi(10, 'a', 'b', 'c');
    cout << "toal steps:" << step << endl;
}
