use strict;
use warnings;
use v5.10;
my $isBegin = 1;
my $wasWhiteLine = 0;
while (<>) {
    # last unless //;
    $_ =~ s/(\<)(.*?)(\>)//g;
    if ($isBegin && $_ =~ /^\s*$/) {
        next;
    }
    if ($isBegin && $_ !~ /^\s*$/) {
        $isBegin = 0;
    }
    if (!$isBegin && $_ =~ /^\s*$/) {
        $wasWhiteLine = 1;
        next;
    } else {
        if ($wasWhiteLine) {
            print "\n";
            $wasWhiteLine = 0;
        }
        $_ =~ s/^\s+|\s+$//g;
        $_ =~ s/[\h\s]+/ /g;
        say $_;
    }
}