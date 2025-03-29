class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        set<int> elements;
        for(auto& num : nums){
            elements.insert(num);
        }

        return elements.size() != nums.size();
    }
};