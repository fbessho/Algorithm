#include <stdio.h>
#include <stdlib.h>

typedef struct node {
	int value;
	struct node* next;
} node;

void show(node* header) {
	node* p = header;
	while(p) {
		printf("%d ", p->value);
		p = p->next;
	}
	printf("\n");
}

void remove_node(node** header, int value) {
	node** pp = header;
	while(*pp) {
		if((*pp)->value == value) {
			*pp = (*pp)->next;
		}
		else {
		    pp = &((*pp)->next);
		}
	}
}

node* initialize() {
	int i;
	node *p=NULL, *p_tmp;;
	int values[] = {0, 1, 2, 3, 3, 4, 5};
	for(i=6; i>=0; i--) {
		p_tmp = malloc(sizeof(node));
		p_tmp->value = values[i];
		p_tmp->next = p;
		p = p_tmp;
	}

	return p;
}

int main(void) {
	node* head = initialize();
	show(head); // 0 1 2 3 3 4 5

	remove_node(&head, 3);
	show(head);  // 0 1 2 4 5

	remove_node(&head, 0);
	show(head);  // 1 2 4 5

	remove_node(&head, 7);
	show(head);  // 1 2 4 5

	return 0;
}
