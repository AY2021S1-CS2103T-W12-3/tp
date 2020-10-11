package seedu.address.logic.commands.patient;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.CommandResult;
import seedu.address.model.AppointmentBook;
import seedu.address.model.Model;

/**
 * Clears the address book.
 */
public class ClearPatientCommand extends PatientCommand {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Address book has been cleared!";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.setAppointmentBook(new AppointmentBook());
        return new CommandResult(MESSAGE_SUCCESS, TAB_NUMBER);
    }
}