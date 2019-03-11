# TestConstraintLayoutGroup

Sample project to demonstrate an issue when testing a ConstraintLayout Group with Robolectric.

It's a simple activity with a few views and hides them using two methods --
one using the ConstraintLayout Group, another manually hiding the views.

To verify this, run ConstraintLayoutGroupTest, which contains two tests:
- one unit test hides the views using the ConstraintLayout Group, and it fails
- the other unit test hides each view manually, and it passes.
