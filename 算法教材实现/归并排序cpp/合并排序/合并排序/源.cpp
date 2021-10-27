#include <iostream>
using namespace std;

template<class type>
void Merge(type a[], int l, int m, int r) {
	int n = r - l + 1;
	type* tmp = new type[n];
	int i = 0;
	int left = l;
	int right = m + 1;
	while (left <= m && right <= r)
		tmp[i++] = a[left] <= a[right] ? a[left++] : a[right++];
	while (left <= m)
		tmp[i++] = a[left++];
	while (right <= r)
		tmp[i++] = a[right++];
	for (int j = 0; j < n; ++j)
		a[l + j] = tmp[j];
	delete[] tmp;
}


template<class type>
void MergeSort(type a[], int left, int right) {
	if (left < right) {
		int mid = (left + right) / 2;
		MergeSort(a, left, mid);
		MergeSort(a, mid + 1, right);
		Merge(a, left, mid, right);
	}
}
int main() {
	int a[] = { 56,36,66,12,83,45,6,53 };
	MergeSort(a, 0, 7);
	for (auto num : a) {
		cout << num << ' ';
	}


}