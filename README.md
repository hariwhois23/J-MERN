#  Git Commands Involving `file.1` and `file.2`

## Repository Initialization

```bash
git init
```

##  Checking Status
```bash
git status file.1 file.2
```

##  Adding and Staging Files
```bash
git add file.1 file.2
```

##  Committing Changes
```bash
git commit -m "Modified file.1 and file.2"
```

##  Modifying and Updating Files
```bash
# After making changes to files
git add file.1 file.2
git commit -m "Updated file.1 and file.2"
```

##  Removing Files
```bash
git rm file.1 file.2
git commit -m "Removed file.1 and file.2"
```

##  Restoring Files
```bash
git restore file.1 file.2       # Restore uncommitted changes
```

##  Unstaging Files
```bash
git reset file.1 file.2
```

##  Viewing Differences
```bash
git diff file.1 file.2              # Compare working directory with index
git diff --cached file.1 file.2     # Compare staged changes with last commit
```

##  Viewing File History
```bash
git log file.1 file.2
```

##  Branching
```bash
# Create a new branch
git branch new-feature

# Switch to the new branch
git checkout new-feature

# OR create and switch
git switch -c new-feature
```

##  Merging Changes
```bash
# Merge 'new-feature' into current branch (e.g., main)
git checkout main
git merge new-feature

# Resolve any conflicts in file.1 or file.2, then:
git add file.1 file.2
git commit -m "Resolved merge conflicts in file.1 and file.2"
```

##  Rebasing
```bash
# Rebase current branch onto main
git checkout new-feature
git rebase main

# If conflict occurs in file.1 or file.2
# Fix conflicts manually, then:
git add file.1 file.2
git rebase --continue
```

##  Cherry-Picking
```bash
# Cherry-pick a specific commit that includes file.1 or file.2
git checkout target-branch
git cherry-pick <commit-hash>

# Resolve conflicts if any
git add file.1 file.2
git cherry-pick --continue
```

##  Cleaning Up
```bash
# Delete the branch after merge if no longer needed
git branch -d new-feature
```
