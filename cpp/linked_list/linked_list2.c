#include <stdio.h>
#include <stdlib.h>

typedef struct node {
	int value;
	struct node* next;
} node;

node* initialize() {
	int i;
	node *n = NULL, *n_tmp;
	for(i=5; i>=0; i--) {
		n_tmp = malloc(sizeof(node));
		n_tmp->value = i;
		n_tmp->next = n;
		n = n_tmp;
	}
	return n;
}

/* remove_node(node** head, int value)

Remove the first found node with the value specified and
return the pointer to the removed node.

If no node has the value specified, don't touch the nodes
and return NULL.
*/
node* remove_node(node** head, int value) {
	node** p = head;
	while (*p!=NULL && (*p)->value!=value) {
		p = &((*p)->next);
	}

	if (*p == NULL) {
		return NULL;
	}

	node* deleted_node = *p;
	*p = deleted_node->next;
	deleted_node->next = NULL;

	return deleted_node;
}

void show(node* head) {
	node* n = head;
	while (n) {
		printf("%d ", n->value);
		n = n->next;
	}
	printf("\n");
}

int main() {
	node* head = initialize();

	show(head); // 0 1 2 3 4 5
	
	remove_node(&head, 3);
	show(head); // 0 1 2 4 5

	remove_node(&head, 0);
	show(head); // 1 2 4 5

	remove_node(&head, 7);
	show(head); // 1 2 4 5
	
	return 0;
}
