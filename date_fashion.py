def date_fashion(you, date):
    # If either person has a style of 2 or less, return 0 (no)
    if you <= 2 or date <= 2:
        return 0
    # If either person has a style of 8 or more, return 2 (yes)
    if you >= 8 or date >= 8:
        return 2
    # Otherwise, return 1 (maybe)
    return 1
