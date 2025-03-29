class Solution {
  public:
    ListNode *reverseList(ListNode *head) {
        ListNode *current = head;
        ListNode *previous = nullptr;
        ListNode *next;

        while (current) {
            next = current->next;
            current->next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
};