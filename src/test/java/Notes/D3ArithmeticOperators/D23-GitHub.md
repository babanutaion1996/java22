# Git
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
- Code tracking tool that is use to share project files and collaborate between people who are working on same project.
- Git is a version control, that is used by different platforms such as, GitHub, BitBucket.

# GitHub
- Cloud platform for hosting for hosting source code.
- Users create a repository on this cloud(platform), then share and colloborate on the project using `GIT` version control technology.

* ** Is Git and GitHub the same thing?**
    - They are not the same, Git is technology used for sharing and colloboration, GitHub creates a cloud based platform
    - that people can use for storing and sharing their code using `Git` technology.

# How do We send our code to a Git Repository For The First Time?
1. Create a repository for your code base on `GitHub`.
2. Create an **Personal Authorization Token(PAT)**
    * **How Do We Create PAT?**
        1. Go to Settings in your `GitHub` dashboard
        2. On the setting scroll down and find *Developer Settings**
        3. On the developer settings, find **PAT**
        4. Create one
        5. Once you created it will show your **PAT** to you and you have to copy it somewhere you can find it later.
        6. The **GitHub** shows your PAT only one time to you.
        * **What happens when you lose your PAT?**
            - Don't worry about it because, you could just create a new one and use it.

* **First 2 steps were about GitHub platform now we will start using `Git` technology.**

3. Find your project directory on your local in the terminal.
    * To find the location, just open the intellj and go to your project directory right click and copy **path** (Absolute  Patch).
4. Initialize `Git` on the project directory
    * This tells the `Git` technology that you are going to use git as a version control on your project.
    * At this step `.git` directory, which track all the changes in your project will be created.
    * Enter the command following on the terminal ->`git init`
   
### NOTE! To find location of file/directory just drag and drop directory/file to terminal and it will show the location.
### NOTE! To see where you are on the temrinal use `pwd`.

5. Add the changed files that you would like to share in your repository
    * **How can you see which files have ben added previously?**
        - **`git status`**: Allows you to see which changes have been added, and which have been changed but not yet added.
    * **How do you I add changed files?**
        - **`git add`**: Git add command followed by the name of the file that you want to add, such as `git add filename`.
    * **What if you want to add all your changes?**
        -**`git add -A`**: adds all the changed files.
    * In this step **added** files are still in **local** but in staging area.
    * Staging area is still in local, but it is a group of files that is set to got to the remote.

6. Commit the finalized changes 
   * Once our changes are finalized, I will commit with a message to state that there won't be any changes for this sequence.
   *  `git commit -m` "commit message here" : Git commit command must be used with a message. In the message usually you
   * define what are the changes in the commit.
   * Our code is still in **local**.
7. Push the code for the first time.
   * Pushing the code, sends all the commited files to remote repository.
   * In order to have a succeseful push for the first time:
      1. You mush have remote repository defined in your git directory.
         - `git remote add remoteName remoteUrl`: remoteName: can be anything ; remoteUrl is the url from your gitHub repository.
      2. You must have a main branch:(You create main branch one time).
         - `git branch -M mainBranchName` : Main branch name could be anything.
   * For the **first push** you enter `git push -u remoteName mainBranchName`
   ```bash
   git push -u origin main
    ```
   * After first push you only need to do `git push`.
   * Only after this step, code goes to remote.

# Once you pushed for the first time, the others pushes will follow steps
1. **Git add** for the file that you want to commit
2. **Git commit** for to state that you finalize your changes for the sequence.
3. **Git Push** to send committed files to remote repository.

**Study**:
1. Location of the files / paths / relative paths.
2. Know, git add,git commit, git push.