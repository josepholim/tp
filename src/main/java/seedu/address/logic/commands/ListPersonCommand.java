package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_PERSONS;
import seedu.address.model.Model;

/**
 * The command handler for {@code list contact} command
 */
public class ListPersonCommand extends ListCommand {
    public static final String MESSAGE_SUCCESS = "Listed all persons";
    public static final String SECONDARY_COMMAND_WORD = "contact";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
