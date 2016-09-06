#include <stdio.h>
#include <string.h>

int brute_force(char* text, char* pattern) {
	int i = 0;
	int j = 0;
	int text_len, pattern_len;
	text_len = strlen(text);
	pattern_len = strlen(pattern);
	
	while( i<text_len && j < pattern_len) {
		if (text[i] == pattern[j]) {
			i++; j++;
		}
		else {
			i = i-j+1;
			j = 0;
		}
	}

	if (j == pattern_len)
		return i;
	else
		return -1;
}


int main(int args, char **argv) {
	char* pattern = argv[1];
	char* text = argv[2];

	int ans;
	ans = brute_force(text, pattern);
	printf("%d\n", ans);
}
