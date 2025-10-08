class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        def function(spell, potions, success):
            m = len(potions)
            left, right = 0, m - 1
            
            # This will store the index of the first successful potion.
            # We default it to m, so if no potion is strong enough, the count (m - index) will be 0.
            first_success_idx = m
            
            while left <= right:
                mid = left + (right - left) // 2
                
                # Check if the potion at the middle index is strong enough
                if spell * potions[mid] >= success:
                    # This potion works! It's a potential answer.
                    # We store its index and check the left half for an even earlier success.
                    first_success_idx = mid
                    right = mid - 1
                else:
                    # This potion is too weak. We need to look for a stronger one.
                    # We check the right half.
                    left = mid + 1
            
            # The number of successful potions is the total count minus the first valid index
            return m - first_success_idx

        # The main logic is unchanged
        potions.sort()
        n = len(spells)
        res = []
        for i in range(n):
            res.append(function(spells[i], potions, success))
        return res