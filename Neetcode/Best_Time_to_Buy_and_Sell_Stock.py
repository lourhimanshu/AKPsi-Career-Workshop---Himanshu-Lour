class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        min_price = float('inf')  # Set min_price to a very high value
        max_profit = 0  # Start with zero profit

        for price in prices:
            if price < min_price:
                min_price = price  # Update min price if we find a lower price
            max_profit = max(max_profit, price - min_price)  # Calculate profit

        return max_profit