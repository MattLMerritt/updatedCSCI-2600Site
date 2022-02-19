# Rebuilding CSCI 2600 Site

The goal of this project is to create an updated design for the RPI Spring 2022 CSCI 2600 course. The current design of the website is relativly plain and leaves room for improvement.This project is to make improvements to the GUI for the site inorder to improve aesthetic and accessibility.

## Table of contents

* Installation
* Usage
  * Updating Resources
    * Quizes
  * Topics
* Additional Features
  * Calendar
  * Webex Buttons
* Contributing
* Upcoming Features
* License

## Installation

```sh
git clone https://github.com/MattLMerritt/updatedCSCI-2600Site.git
```

## Usage

The updated website has various new features, that for the owner hosting the site to provide up-to-date resources for students who are taking the course.

### Updating Resources

To update quizes:
find desired quiz by replacing the in the follwing # with the quiz number:

```html
id="quiz#-content"
```

then remove ``!--`` from the code segment  ```<!--div id="quiz#-content">```

### Updating Topics

Find the desired topic by replacing in the following # with the topic number.

```html
id="topic#"
```

then remove ``!--`` from the code segment  ```<!--div class="card bg-light mb-3" id="topic#">```

## Additional Features

### Calendar

The Weekly Schedule calenar is currently a static image, but using an iframe component that is connected to a live published google sheets, a dynamiclly updated and live shedule can be displayed.

To add the new new live calendar feature:

1. Populate Google Sheet with data

2. Publish Google sheet and get embeded link
3. Identify the ```id="office-hours-iframe"``` element within Schedule.html
4. Change src from element in step 3 to embeded link found in step 2

### Webex Buttons

All Webex buttons found on index.html corispond to functional links for the repective office hours of the TAs.

## Contributing

The goal is to make contributing to this project as easy and transparent as possible, whether it's:

- Reporting a bug
- Discussing the current state of the code
- Submitting a fix
- Proposing new features
- Becoming a maintainer

### How To Contribute?

Pull requests are the best way to propose changes to the codebase (we use [Github Flow](https://guides.github.com/introduction/flow/index.html)). We actively welcome your pull requests:

1. Fork the repo and create your branch from master
2. Make sure your code lints
3. Make clear commits
4. Issue the pull request!

## Upcoming Features

* Add a list of updated features to README.md of current site compared to original site.
* Implement abililty to easily update new visible contents by uncommenting prefilled sources. Sources include documents for future lessons, reccomended reading material, etc...
  * Done:
    * Homeworks
    * Topics
    * Quizes in Resources
    * Quiz Answers in Resources
  * Remaining:
    * Exams/Midterms

## License

[MIT](https://choosealicense.com/licenses/mit/)

### Used Licenses

* Homepage photo under NASA Media Usage Guidelines for educational purposes:
  * <https://images.nasa.gov/details-iss040e010458>
* Bootswatch under MIT License
  * <https://github.com/thomaspark/bootswatch/blob/v5/LICENSE>
