# Module 1 Code Reviews

## Process

_See [this document](../misc/code-reviews.md) for a complete breakdown of the code review process._

## Requirements Checklist

* [ ] Features (each feature complete, works without errors)
  * [ ] Check In
  * [ ] Check Out
  * [ ] View Guests
* [ ] Methods (makes each high level scenario into a separate method)
* [ ] Array Management
  * [ ] View Guests displays properly even at the ends of the array
  * [ ] Guests are added and removed from the array
* [ ] Decisions and Repetition (uses appropriate decision and repetition statements)
* [ ] Naming (uses consistent and meaningful names for variables and methods)
* [ ] Code Format (Java code formatting is idiomatic)
* [ ] Data Types (no unused variables; data types are sensible)

## Test Plan

* [ ] Create a hotel of size 50
  * [ ] Can this be accomplished using the console at startup or is it hard coded?
* [ ] **Check in** a guest to capsule 1
* [ ] **Check in** a guest to capsule 50
* [ ] **Check in** a guest to capsule 25
* [ ] **Check in** another guest to capsule 25
  * [ ] Does the application prevent the new guest from being checked in?
* [ ] **View guests** starting at capsule 25
  * [ ] Does the application display the checked in guest at that position?
  * [ ] Does the application display `unoccupied` for unoccupied capsules?
* [ ] **Check out** the guest in capsule 25
* [ ] **View guests** starting at capsule 25
  * [ ] Does the application display `unoccupied`?
* [ ] **Check in** a differently named guest to capsule 25
* [ ] **View guests** starting at capsule 25
  * [ ] Does the application display the new guest name at that position?
* [ ] **View guests** starting at capsule 3
  * [ ] Does the application display the correct number of capsules?
  * [ ] Does the application display the guest checked into capsule 1?
* [ ] **View guests** starting at capsule 48
  * [ ] Does the application display the correct number of capsules?
  * [ ] Does the application display the guest checked into capsule 50?
* [ ] **Check out** a guest from capsule 30 (or any empty capsule)
  * [ ] Does the application inform that there is no one checked into that capsule?