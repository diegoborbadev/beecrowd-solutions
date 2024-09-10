#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int v;
    struct node *left, *right;
} node;

node *createNode(int n) {
    node *newNode = (node *)malloc(sizeof(node));
    if (newNode == NULL) {
        perror("Failed to allocate memory");
        exit(EXIT_FAILURE);
    }
    newNode->v = n;
    newNode->left = newNode->right = NULL;
    return newNode;
}

void preorder(node *r) {
    if (r) {
        printf(" %d", r->v);
        preorder(r->left);
        preorder(r->right);
    }
}

void inorder(node *r) {
    if (r) {
        inorder(r->left);
        printf(" %d", r->v);
        inorder(r->right);
    }
}

void postorder(node *r) {
    if (r) {
        postorder(r->left);
        postorder(r->right);
        printf(" %d", r->v);
    }
}

void insert(int n, node *r) {
    if (n < r->v) {
        if (r->left != NULL)
            insert(n, r->left);
        else
            r->left = createNode(n);
    } else {
        if (r->right != NULL)
            insert(n, r->right);
        else
            r->right = createNode(n);
    }
}

void freeTree(node *r) {
    if (r) {
        freeTree(r->left);
        freeTree(r->right);
        free(r);
    }
}

int main(void) {
    int c, n, i, v;
    scanf("%d", &c);
    for (i = 1; i <= c; ++i) {
        scanf("%d", &n);
        scanf("%d", &v);
        node *root = createNode(v);
        for (int j = 1; j < n; ++j) {
            scanf("%d", &v);
            insert(v, root);
        }
        printf("Case %d:", i);
        printf("\nPre.:");
        preorder(root);
        printf("\nIn..:");
        inorder(root);
        printf("\nPost:");
        postorder(root);
        printf("\n\n");

        freeTree(root);
    }
    return 0;
}
